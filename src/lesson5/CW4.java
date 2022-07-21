package lesson5;

public class CW4 {
  public static void main(String[] args) {
      public class SmallestIntegerFinder {
            public static int findSmallestInt(int[] args) {
                int max = args[0];
                for (int i = 0; i < args.length; i++)
                    if (max >= args[i]){
                        max = args[i];
                    }
                return max;
            }
        }
    }
}
