public class Maximum {
    public static int getMaximumInteger(Integer[] i) {
        Integer max = i[0];
        for (Integer element : i) {
            if (element.compareTo(max) > 0)
                max = element;
        }
        System.out.println("Largest element is:" + max);
        return max;
    }

}