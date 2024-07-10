package com.volvocars.conncar.connectivityinsight.proto.events;

import com.google.protobuf.InvalidProtocolBufferException;
import com.volvocars.conncar.connectivityinsight.proto.events.UserAccount.UserAccountUpdated;
import java.util.Base64;

public class ProtoBufBase64Decode {

    /*
     * timestamp: 1719823439307
     * eventType: USER_DELETED_ACCOUNT
     * id: "3e805301-74a6-4092-b664-87a49d0e1569"
     * market: "CN"
     * brand: VOLVO
     * type: "HEADLESS"
     * channel: "j59wfk5_21"
     * language: "zh"
     * usernameType: PHONE
     */
    /*
     * timestamp	eventtype	id	market	brand	type	channel	language	usernametype	gmt_year	gmt_month	gmt_day
     * 40:26.5	USER_REQUESTED_PASS_CHANGE	9a1c1d8e-beb5-42dd-96dc-4400f880f084	CN	VOLVO	HEADLESS	MYVOLVO	zh	PHONE	2024	1	26
     */
    // 解析出来的和Jonas的lambda解析出来的并保存到s3 table中的数据完全匹配

    public static void main(String[] args) throws InvalidProtocolBufferException {
        // Base64-encoded string
//        String base64String = "CMur3OuGMhACGiQzZTgwNTMwMS03NGE2LTQwOTItYjY2NC04N2E0OWQwZTE1NjkiAkNOKAAyCEhFQURMRVNTOgpqNTl3Zms1XzIxQgJ6aEgA";
        String base64String = "COD7zauJMhADGiRiMzZlNDIwOS0zZGM1LTRkM2QtOTljMC1kZjkxYjAyMzcxOWQiAkNOKAAyBlBPUlRBTDoHTVlWT0xWT0ICemhIAA==";
        byte[] bytes = Base64.getDecoder().decode(base64String);
        UserAccountUpdated userAccountUpdated = UserAccountUpdated.parseFrom(bytes);
        System.out.println(userAccountUpdated);
    }
}
