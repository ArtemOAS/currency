package com.bl;

import com.dto.sberbank.responce.Responce;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DataCurrencyBL {
    @Autowired
    private RestTemplate restTemplate ;

    public Responce getCurrencySB(){
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        requestHeaders.add("Accept-Encoding", "gzip, deflate, sdch");
        requestHeaders.add("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.6,en;q=0.4");
        requestHeaders.add("Cache-Control", "no-cache");
        requestHeaders.add("Connection", "keep-alive");
        requestHeaders.add("Cookie", "anonymousUserId=64841d8e-37f5-4139-90e6-fb7b449d4c7e; sbrf.region_id=77; _ym_uid=1491154537497080848; BBTracking=MjA=; cfids55=HqCMXgLEO-CIOJMQEM8Zp3BigIQ00J9fPzNKss9HN3eUTyz9-P3m4ZF-9kUH81sWqjsh4qMla5viJFNtSlnK3oGTauBSuc7Ow5MRy7hhGjsw1fiVGchbP5WbgykFAfN5ZiV+PyK00wy4RzXh60H7URWaJ0hH6fCdghxH-nOLzwc=; _ym_isad=2; _ga=GA1.2.886182396.1491154537; cfids2=oKX-ZUomYwdCKqgTx8Vb0XQKXx60ZCPsbx6ZCMijDda5Zfx4A7WMMfeRM99YESV9SjFODRlwtbl8IsH-63Z4PS9+j7j8qggotEWuBjSoPWX2ScY7h5mAbHHMvOwxbg+EKf5wqC9TMeqNmsDhkd39YqAwqSOm1hzdDKfPgXFXrxo=; clsc2=H1tt8dFCT30wejZHFK/wvBfIKL0+uNNWVXiLUWdlY0luG0NNa8jKdbETcRzgkWf8P1qaWHhAmltinXxIVdAjvJgT7YCLrUyH1xN3UIydTr/u36aYQpTItwxg6lw4Y9r0J44BPSw+jKnFSj63GOHZ9AZ9ysLWBOBuecNtEMwJdl4=");
        requestHeaders.add("Host", "www.sberbank.ru");
        requestHeaders.add("Pragma", "no-cache");
        requestHeaders.add("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");


        ResponseEntity<String> rest = restTemplate.exchange("http://www.sberbank.ru/common/js/get_quote_values.php?version=1&inf_block=123&_number_amount114=10000&qid[]=3&qid[]=2&cbrf=0&period=on&_date_afrom114=24.06.2015&_date_ato114=24.06.2015&mode=full&display=json",
                HttpMethod.GET, new HttpEntity<Object>(requestHeaders, null), String.class);

        return new Gson().fromJson(rest.getBody(), Responce.class);
    }

}
