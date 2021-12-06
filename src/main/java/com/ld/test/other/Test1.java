package com.ld.test.other;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author lidian1
 * @description BM算法实现
 * @date 2021/10/14 19:48
 **/

public class Test1 {
    private static final String PAR = "HELLO JD WORLD";

    public static void main(String[] args) throws IOException {
        if (null == args || args.length == 0) {
            System.out.println("请输入main函数参数。例：java -jar lidian1.jar ./xxx.txt");
            return;
        }
        long startReadFileTime = System.currentTimeMillis();
        Stream<String> stream = Files.lines(Paths.get(args[0]));
        long count = stream.parallel().mapToLong(item -> countMatches(item, PAR)).sum();
        long endCulTime = System.currentTimeMillis();
        System.out.println("匹配耗时毫秒数 = " + (endCulTime - startReadFileTime) + ",匹配数 = " + count);
    }

    public static int countMatches(String str, String sub) {
        if (!isEmpty(str) && !isEmpty(sub)) {
            int count = 0;

            for(int idx = 0; (idx = str.indexOf(sub, idx)) != -1; idx += sub.length()) {
                ++count;
            }

            return count;
        } else {
            return 0;
        }
    }
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}