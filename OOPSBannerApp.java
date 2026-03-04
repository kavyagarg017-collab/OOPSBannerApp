class OOPS {
    public static void main(String[] args) {

        // Declare and initialize String array using String.join()
        String[] banner = {
            String.join("   ",
                " ***** ",  // O
                " ***** ",  // O
                " ***** ",  // P
                " ***** ",  // P
                " ***** "   // S
            ),
            String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*      "
            ),
            String.join("   ",
                "*     *",
                "*     *",
                " ***** ",
                " ***** ",
                " ***** "
            ),
            String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "*      ",
                "     * "
            ),
            String.join("   ",
                " ***** ",
                " ***** ",
                "*      ",
                "*      ",
                " ***** "
            )
        };

        // Loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
