class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();

        for (String x : operations) {
            switch(x) {
                case "+": 
                    int a = list.get(list.size() - 1);
                    int b = list.get(list.size() - 2);
                    list.add(a + b);
                    break;
                case "D":
                    list.add(list.get(list.size() - 1) * 2);
                    break;
                case "C":
                    list.remove(list.size() - 1);
                    break;
                default:
                    list.add(Integer.parseInt(x));
            }
        }

        return list.stream().reduce(0, Integer::sum);
    }
}