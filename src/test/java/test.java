import com.demo.AppDeptConverter;
import com.demo.DeptCalcuateDTO;
import com.demo.DeptDTO;
import com.lvmenglou.dao.PersonDaoImpl;
import com.sun.jmx.snmp.Timestamp;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class test {

    @Autowired
    private AppDeptConverter appDeptConverter;

    public static void main(String[] args) {
        testJava8_2();
    }


    public static void testJava8_2() {
        Map<Integer, String> platformMap = new HashMap<>();
        platformMap.put(1, "掘金");
        platformMap.put(2, "知乎");
        platformMap.put(3, "微信公账号");

//        Set<Integer> setKey = platformMap.keySet();
//        setKey.remove(1);

        Set<Integer> setKey = platformMap.keySet().stream().collect(Collectors.toSet());
        setKey.remove(1);
        return;
    }

    public static void testJava8_1() {

        List<String> list = Arrays.asList("123", "45634", "7892", "abch", "sdfhrthj", "mvkd");
        list.stream().forEach(e ->{
            if(e.length() >= 5){
                return;
            }
            System.out.println(e);
        });

        List<String> platformList = new ArrayList<>();
        platformList.add("掘金");
        platformList.add("知乎");
        platformList.add("微信公账号");

        platformList.stream().forEach(platform -> {
            System.out.println(platform);
            return;
        });

        System.out.println("----xxxxxx");
    }

    public void testConvert() {
        DeptDTO dept1 = new DeptDTO();
        DeptDTO dept2 = new DeptDTO();

        dept1.setDeptCode("111");;
        dept2.setDeptCode("222");;

        List<DeptDTO> deptList = new ArrayList<>();
        deptList.add(dept1);
        deptList.add(dept2);

//        DeptCalcuateDTO deptCalcuateDTO = (DeptCalcuateDTO) dept1;
//        DeptCalcuateDTO deptCalcuateDTO =  appDeptConverter.toDeptTree(dept1);
        DeptCalcuateDTO deptCalcuateDTO =  AppDeptConverter.INSTANCE.toDeptCalcuate(dept1);
        deptCalcuateDTO.setDeptCode("333");

        for (DeptDTO deptRecord : deptList) {
            System.out.println("Print deptCode:" + deptRecord.getDeptCode());
        }
    }

    public static void testNumber() {
        double GOODS_CUSTOM_INSURACNE_AMOUNT_MAX = 999999;
        double DEFAULT_CUSTOM_INSURACNE_AMOUNT = -1;

        String propertyValue = "59.9919";
        double customInsuranceAmount =  NumberUtils.toDouble(propertyValue, DEFAULT_CUSTOM_INSURACNE_AMOUNT);
        if (customInsuranceAmount < 0 || customInsuranceAmount > GOODS_CUSTOM_INSURACNE_AMOUNT_MAX) {
            customInsuranceAmount = DEFAULT_CUSTOM_INSURACNE_AMOUNT;
        }
        customInsuranceAmount = round(customInsuranceAmount, 2);
        System.out.println("---------:" + customInsuranceAmount);
    }

    public static void testDate() {
        String birthday ="2017-02-22 11:10:09";

        SimpleDateFormat sdf = new SimpleDateFormat(("yyyy-MM-dd"));
        java.util.Date date = null;
        try {
            date = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        System.out.println(new java.sql.Date(date.getTime()));

//        long times = System.currentTimeMillis();
//        Date date = new Date(times);
//
        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        String dateString = formatter.format(date);
        System.out.println(dateString);

    }

    public static void testListAndMap() {
        List<String> platformList = new ArrayList<>();
        platformList.add("掘金");
        platformList.add("知乎");
        platformList.add("微信公账号");

        // List情况1：
        for (String platform : platformList) {
            if (platform.equals("掘金")) {
                platformList.remove(platform);
            }
        }
        System.out.println(platformList);

//        // List情况2：
//        platformList.forEach(platform -> {
//            if (platform.equals("知乎")) {
//                platformList.remove(platform);
//            }
//        });
//        System.out.println(platformList);
//
//        // List情况3：
//        Iterator iterator3 = platformList.iterator();
//        while (iterator3.hasNext()) {
//            String platformStr = (String) iterator3.next();
//            if (platformStr.equals("掘金")) {
//                platformList.remove(platformStr);
//            }
//        }
//        System.out.println(platformList);
//
        // List情况4：
//        Iterator<String> iterator4 = platformList.iterator();
//        while (iterator4.hasNext()) {
//            String platformStr = iterator4.next();
//            if (platformStr.equals("掘金")) {
//                iterator4.remove();
//            }
//        }
//        System.out.println(platformList);
////
//        Map<Integer, String> platformMap = new HashMap<>();
//        platformMap.put(1, "掘金");
//        platformMap.put(2, "知乎");
//        platformMap.put(3, "微信公账号");
//
//        // Map情况1：
//        for (Map.Entry<Integer, String> entry : platformMap.entrySet()) {
//            Integer entryKey = entry.getKey();
//            if (entryKey.equals(1)) {
//                platformMap.remove(1);
//            }
//        }
//        System.out.println(platformMap);
//
//        // Map情况2：
//        platformMap.forEach((key, value) -> {
//            if (key.equals(1)) {
//                platformMap.remove(1);
//            }
//        });
//        System.out.println(platformMap);
//
//        // Map情况3：
//        Iterator<Integer> iterator = platformMap.keySet().iterator();
//        while (iterator.hasNext()) {
//            Integer platformMapKey = iterator.next();
//            if (platformMapKey.equals(1)) {
//                iterator.remove();
//            }
//        }
//        System.out.println(platformMap);
    }

    public  static void testList() {
        DeptDTO dept1 = new DeptDTO();
        DeptDTO dept2 = new DeptDTO();
        dept1.setDeptCode("111");
        dept2.setDeptCode("222");

        List<DeptDTO> deptList = new ArrayList<>();
        deptList.add(dept1);
        deptList.add(dept2);

        for (DeptDTO deptDTO : deptList) {
            if (deptDTO.getDeptCode().equals("222")) {
                deptList.remove(deptDTO);
            }
        }

        Iterator<DeptDTO> iterator = deptList.iterator();
        while (iterator.hasNext()) {
            DeptDTO platform = iterator.next();
            iterator.remove();
        }

        DeptCalcuateDTO deptCalcuateDTO =  AppDeptConverter.INSTANCE.toDeptCalcuate(dept1);
        deptCalcuateDTO.setDeptCode("333");

        for (DeptDTO deptRecord : deptList) {
            System.out.println("Print deptCode:" + deptRecord.deptCode);
        }

        Map<String, DeptDTO> deptMap = new HashMap<>();
        deptMap.put("111", dept1);
        deptMap.put("222", dept2);

        deptMap.forEach((deptCode, deptInfo) -> {
            deptInfo.setDeptCode("666");
            return;
        });


        for(Map.Entry<String, DeptDTO> depEntry : deptMap.entrySet()) {
            DeptDTO test = depEntry.getValue();
            test.setDeptCode("777");
            break;
        }

        deptMap.forEach((deptCode, deptInfo) -> {
            System.out.println("Print deptCode:" + deptInfo.deptCode);
        });


//        List<DeptCalcuateDTO> deptCalcuateList = new ArrayList<>();

//        for (DeptDTO deptRecord : deptList) {
//            System.out.println("Print deptCode:" + deptRecord.getDeptCode());
//        }
//
//        // 获取里面的元素，其实是获取的引用，修改该元素值，会影响personList的值
//        DeptDTO dept = deptList.get(0);
//        dept.setDeptCode("333");
//
//        // 修改该值，会直接影响deptList的值，证明deptList.add()存入的是对象的引用
//        dept1.setDeptCode("444");
//
//        for (DeptDTO deptRecord : deptList) {
//            System.out.println("Print deptCode:" + deptRecord.getDeptCode());
//        }
//
//
//        System.out.println(System.identityHashCode(dept));
//        System.out.println(System.identityHashCode(dept1));
//        System.out.println(System.identityHashCode(deptList.get(0)));
    }
    /**
     * 提供精确的小数位四舍五入处理。
     *
     * @param v     需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
