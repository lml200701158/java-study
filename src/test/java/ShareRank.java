import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class ShareRank {

//    /**
//     * 人员映射表
//     */
//    private static Map<Integer, String> NAME_INDEX_MAP = new HashMap<Integer, String>() {
//        {
//            put(1,"刘东山");
//            put(2,"万腾飞");
//            put(3,"刘文庆");
//            put(4,"李天杰");
//            put(5,"李远航");
//            put(6,"魏熙");
//            put(7,"李顺喜");
//            put(8,"吕梦楼");
//        }
//    };

    /**
     * 人员随机排序
     * @param index 批次
     */
    private static void RankName(Integer index) {
        log.info("生活要有仪式感，开始第 {} 轮排序啦~~", index);
        List<String> nameList = Arrays.asList("刘东山","万腾飞","刘文庆","李天杰","李远航","魏熙","李顺喜","吕梦楼");
        Collections.shuffle(nameList);
        log.info("排序结果：{}", nameList.toString());
        log.info("好幸运！下次分享的同学是「{}」，恭喜你获得最先的表现机会!", nameList.get(0));
    }

    public static void main(String[] args) {
        RankName(2);
    }
}
