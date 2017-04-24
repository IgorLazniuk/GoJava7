package module01.training;


/**
 * Created by IGOR.LAZNIUK on 19.04.2017.
 */
public class Amazon {
    public static void main(String[] args) {
        System.out.println(urlModifier(1, "https://www.amazon.com/s/ref=sr_pg_3?fst=p90x%3A1&rh=i%3Aaps%2Ck%3Aumbrella&page=558&keywords=umbrella&ie=UTF8&qid=1492586698&spIA=B06Y3265XF,B00UR0EFEK,B01J4UCSFG,B01NAYOAXE"));
    }
    static String urlModifier(int page, String url) {
        return url.replaceFirst("page=[0-9]*", "page=" + page);
    }
}
