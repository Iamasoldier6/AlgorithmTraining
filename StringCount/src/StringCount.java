public class StringCount {
	public static void main(String[] args) {
		String str1 = "ABSABCABCBCSABC";
		String str2 = "ABC";
		System.out.println(new StringCount().count(str1, str2));
	}

	/**
	 * @param a
	 *            被匹配的长字符串
	 * @param b
	 *            匹配的短字符串
	 * @return 匹配次数
	 */
	public int count(String a, String b) {
		if (a.length() < b.length()) {
			return 0;
		}
		char[] str1_array = a.toCharArray();
		char[] str2_array = b.toCharArray();
		int num = 0, temp = 0, j = 0;
		for (int i = 0; i < str1_array.length; i++) {
			// 保证一个连续的字符串str2和str1中某段相匹配
			if (str1_array[i] == str2_array[j] && j < str2_array.length) {
				temp++;
				j++;
				// 连续的字符串str2已跟str1中某段相匹配
				if (temp == str2_array.length) {
					num++;
					temp = 0;
					j = 0;
				}
			} else {
				temp = 0;
				j = 0;
			}
		}
		return num;
	}
}
