public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int num1 = 10;
        int num2 = 20;
        num2 = num1;
        num1 = 30;
        System.out.println(num1+" "+num2);

        int[] nums1={1,2,3};
        int[] nums2={4,5,6};
        nums2=nums1;
        nums1[0]=10;
        System.out.println(nums2[0]);

    }
}