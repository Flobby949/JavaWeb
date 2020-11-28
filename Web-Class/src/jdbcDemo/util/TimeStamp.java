package jdbcDemo.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2020/11/27
 * @Description :时间戳
 */

public class TimeStamp {
    public String getTimeStamp(){
        StringBuffer stringBuffer = new StringBuffer();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter
                .ofPattern("yyyyMMddhhmmssSSS");
        stringBuffer.append(df.format(now));
        for (int i = 0; i < 3; i++){
            stringBuffer.append((int)(Math.random()*10));
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        TimeStamp ts = new TimeStamp();
        System.out.println(ts.getTimeStamp());
    }
}
