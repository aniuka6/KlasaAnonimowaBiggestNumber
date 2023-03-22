class CompareNumbers {
    public static void main(String[] args) {
        int[] tab = {5,10, -30, 3000, 4378, 90};
        BiggestNumber nc = new BiggestNumber() {
            @Override
            public int takeBiggest(int[] tab) {
                if (tab == null)
                    throw new NullPointerException("argument cannot be null");
                if (tab.length == 0)
                    throw new IllegalArgumentException("array has to have at least 1 value");

                    int biggestNumber = tab[0];
                    for (int i = 0; i < tab.length; i++) {
                        if (biggestNumber < tab[i]) {
                            biggestNumber = tab[i];
                        }
                    }
                    return biggestNumber;
                }
        };
        System.out.println("Największa liczba z tablicy to: " + nc.takeBiggest(tab));
    }
}