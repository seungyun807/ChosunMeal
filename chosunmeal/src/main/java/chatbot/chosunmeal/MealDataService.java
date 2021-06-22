package chatbot.chosunmeal;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.net.ssl.*;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MealDataService {
    public List<MealTable> mealTables = new ArrayList<>();
    private static final String MEAL_DATA_URL = "https://www3.chosun.ac.kr/chosun/608/subview.do";
    private final static String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.3 Safari/605.1.15";

    public static void setSSL() throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustAllCerts = new TrustManager[] {
                new X509TrustManager() {
                    @Override
                    public X509Certificate[] getAcceptedIssuers() {
                        // TODO Auto-generated method stub
                        return null;
                    }
                    @Override
                    public void checkClientTrusted(X509Certificate[] chain, String authType)
                            throws CertificateException {
                        // TODO Auto-generated method stub

                    }
                    @Override
                    public void checkServerTrusted(X509Certificate[] chain, String authType)
                            throws CertificateException {
                        // TODO Auto-generated method stub
                    }
                }
        };
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new SecureRandom());
        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        });
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }

    @PostConstruct
    public void getMealData() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        setSSL();
        Document doc = Jsoup.connect(MEAL_DATA_URL).get();
        Elements contents = doc.select("table tbody tr");
        //System.out.println(contents);

        for (Element content : contents) {
            Elements tdContents = content.select("td");
            MealTable mealTable = MealTable.builder()
                    .day(content.select("th").text())
                    .when(tdContents.get(0).text())
                    .menu(tdContents.get(1).text())
                    .build();
            mealTables.add(mealTable);
        }
        for(int i = 0; i < mealTables.size(); i++) {
            if (i % 2 == 1){
                mealTables.get(i).setDay(mealTables.get(i-1).getDay());
            }
            System.out.println(mealTables.get(i));
        }

    }
}
