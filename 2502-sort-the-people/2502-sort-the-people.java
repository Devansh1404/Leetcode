class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
            int n = names.length;
        String[][] people = new String[n][2];
        for (int i = 0; i < n; i++) {
            people[i][0] = String.valueOf(heights[i]);
            people[i][1] = names[i];
        }
        Arrays.sort(people, (a, b) -> Integer.parseInt(b[0]) - Integer.parseInt(a[0]));
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = people[i][1];
        }

        return result;
    }
}
    