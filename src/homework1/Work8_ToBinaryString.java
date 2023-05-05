package homework1;

public class Work8_ToBinaryString {
    public static String toBinaryString(byte number) {
        String hot = "Десятичная система счисления: " + number;

        if (number <= 0) {
            int boo = 256 + number;
            if (boo >= 1) {
                int b = boo % 2;
                int b1 = boo / 2;


                if ((b1 >= 1)) {
                    int c = b1 % 2;
                    int c1 = b1 / 2;


                    if ((c1 >= 1)) {
                        int d = c1 % 2;
                        int d1 = c1 / 2;


                        if ((d1 >= 1)) {
                            int e = d1 % 2;
                            int e1 = d1 / 2;


                            if ((e1 >= 1)) {
                                int f = e1 % 2;
                                int f1 = e1 / 2;


                                if ((f1 >= 1)) {
                                    int g = f1 % 2;
                                    int g1 = f1 / 2;


                                    if ((g1 >= 1)) {
                                        int k = g1 % 2;


                                        System.out.println("Двоичная система счисления: " + "1 " + k + " " + g + " " + f + " " + e + " " + d + " " + c + " " + b);
                                    } else {
                                        System.out.println("Двоичная система счисления: " + "1 " + "1 " + g + " " + f + " " + e + " " + d + " " + c + " " + b);
                                    }
                                } else {
                                    System.out.println("Двоичная система счисления: " + "1 " + "1 " + "1 " + f + " " + e + " " + d + " " + c + " " + b);
                                }
                            } else {
                                System.out.println("Двоичная система счисления: " + "1 " + "1 " + "1 " + "1 " + e + " " + d + " " + c + " " + b);
                            }
                        } else {
                            System.out.println("Двоичная система счисления: " + "1 " + "1 " + "1 " + "1 " + "1 " + d + " " + c + " " + b);
                        }
                    } else {
                        System.out.println("Двоичная система счисления: " + "1 " + "1 " + "1 " + "1 " + "1 " + "1 " + c + " " + b);
                    }
                } else {
                    System.out.println("Двоичная система счисления: " + "1 " + "1 " + "1 " + "1 " + "1 " + "1 " + "1 " + b);
                }
            } else {
                System.out.println("Введенные данные работают некорректно, проверьте данные");
            }

        } else if ((number >= 1)) {
            int b = number % 2;
            int b1 = number / 2;

            if ((b1 >= 1)) {
                int c = b1 % 2;
                int c1 = b1 / 2;

                if ((c1 >= 1)) {
                    int d = c1 % 2;
                    int d1 = c1 / 2;

                    if ((d1 >= 1)) {
                        int e = d1 % 2;
                        int e1 = d1 / 2;

                        if ((e1 >= 1)) {
                            int f = e1 % 2;
                            int f1 = e1 / 2;

                            if ((f1 >= 1)) {
                                int g = f1 % 2;
                                int g1 = f1 / 2;
                                if ((g1 >= 1)) {
                                    int k = g1 % 2;
                                    System.out.println("Двоичная система счисления: " +  "0 " + k + " " + g + " " + f + " " + e + " " + d + " " + c + " " + b);
                                } else {
                                    System.out.println("Двоичная система счисления: " +  "0 " + "0 " + g + " " + f + " " + e + " " + d + " " + c + " " + b);
                                }
                            } else {
                                System.out.println("Двоичная система счисления: " +  "0 " + "0 " + "0 " + f + " " + e + " " + d + " " + c + " " + b);
                            }
                        } else {
                            System.out.println("Двоичная система счисления: " +  "0 " + "0 " + "0 " + "0 " + e + " " + d + " " + c + " " + b);
                        }
                    } else {
                        System.out.println("Двоичная система счисления: " +  "0 " + "0 " + "0 " + "0 " + "0 " + d + " " + c + " " + b);
                    }
                } else {
                    System.out.println("Двоичная система счисления: " +  "0 " + "0 " + "0 " + "0 " + "0 " + "0 " + c + " " + b);
                }
            } else {
                System.out.println("Двоичная система счисления: " +  "0 " + "0 " + "0 " + "0 " + "0 " + "0 " + "0 " + b);
            }
        } else {
            System.out.println("Введенные данные работают некорректно, проверьте данные");
        }
        return hot;
    }

    public static void main(String[] args) {
        byte nu = 48;
        System.out.println(Work8_ToBinaryString.toBinaryString(nu));

    }
}
