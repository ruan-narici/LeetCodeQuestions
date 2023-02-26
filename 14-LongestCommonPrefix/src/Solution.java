
public class Solution {

	public String longestCommonPrefix(String[] strs) {
		
		if (strs.length == 0) {
			return "";
		}
		String saveString = strs[0];
		for (int palavra = 1; palavra < strs.length; palavra++) {
			while (!saveString.equals(strs[palavra])) {
				if (saveString.length() < strs[palavra].length()) {
					strs[palavra] = strs[palavra].substring(0, strs[palavra].length() -1);
				} else if (saveString.length() >= strs[palavra].length()){
					saveString = saveString.substring(0, saveString.length() -1);
				}
			}
		}
		return saveString;
	}
}
