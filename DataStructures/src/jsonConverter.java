
import java.util.*;

public class jsonConverter {
  public static void main(String[] args) {
    List<Map<String, Object>> dataList = getDataList();
    System.out.println(getDataList());
  }

  private static List<Map<String, Object>> getDataList() {
    List<Map<String, Object>> dataList = new ArrayList<>();

    Map<String, Object> data1 = new HashMap<>();
    data1.put("file_name", "tiktok_1113_2023-10-20_2023-11-19_20231124071137.csv");
    data1.put("latest_modified", "2023-11-24 07:11:38+00:00");
    data1.put("headers", "adgroup_id,adgroup_name,objective_type,ad_account_id,budget,event_ts,impressions,spend,clicks,reach,conversion,conversion_rate,currency");
    data1.put("file_size", 96.736328125);
    data1.put("file_path", "s3://ll-data-onboarding-internal-uat/dataonboarding/processing/native-Tiktok/Tiktok-Connection-PD/Tiktok Adgroup - New-Tiktok-DS/");
    dataList.add(data1);

    Map<String, Object> data2 = new HashMap<>();
    data2.put("file_name", "tiktok_1113_2023-10-20_2023-11-19_20231124071137.csv");
    data2.put("latest_modified", "2023-11-24 07:11:38+00:00");
    data2.put("headers", "adgroup_id,adgroup_name,objective_type,ad_account_id,budget,event_ts,impressions,spend,clicks,reach,conversion,conversion_rate,currency");
    data2.put("file_size", 96.736328125);
    data2.put("file_path", "s3://ll-data-onboarding-internal-uat/dataonboarding/processing/native-Tiktok/Tiktok-Connection-PD/Tiktok Adgroup - New-Tiktok-DS/");
    dataList.add(data2);

    // Add more data here...

    return dataList;
  }
}
