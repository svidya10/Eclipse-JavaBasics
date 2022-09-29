package StringClass;

import utils.StringUtils;

public class StringDemo {
	public static void main(String[] args) {
        String str="Thor love and thunder";
        StringUtils strUtils=new StringUtils();
        strUtils.printAllIndexes(str, 'e');
    }

}
