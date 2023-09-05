
import java.util.Scanner;

public class DoWhileExer {
    public static void main(String[] args) {
        double balance = 10;
        double inWealth = 0;
        double outWealth = 0;

        boolean continueATM = true; // 用于控制是否继续操作的标志

        Scanner scan = new Scanner(System.in);

        do {

            // 延迟五秒进入循环
            // try {
            // Thread.sleep(5000); // 5000毫秒（5秒）
            // } catch (InterruptedException e) {
            // // 处理InterruptedException异常
            // e.printStackTrace();
            // }

            System.out.println("=======ATM======");
            System.out.println("   1.存款");
            System.out.println("   2.取款");
            System.out.println("   3.显示余额");
            System.out.println("   4.退出");
            System.out.print("   5.请选择（1-4）:");

            int num = scan.nextInt();

            // 1.存款
            if (num == 1) {
                System.out.println("您的余额为：" + balance + "元。");
                System.out.print("请输入您的存款额：");
                inWealth = scan.nextDouble();
                balance = balance + inWealth;
                System.out.println("您的余额为：" + balance);
            } else if (num == 2) {

                // 2.取款
                if (balance == 0) {
                    System.out.println("您的账户余额为0元！请充值！");
                } else {
                    System.out.print("请输入您要取得金额：");
                    outWealth = scan.nextDouble();
                    balance = balance - outWealth;
                    if (balance >= 0) {
                        System.out.println("取款成功，余额为：" + balance);
                    } else {
                        System.out.println("余额不足！无法取出");
                    }

                }
            } else if (num == 3) {

                // 3.显示余额
                System.out.println("您的余额为：" + balance + "元。");

            } else if (num == 4) {

                // 4.退卡（退出）
                System.out.println("请在30秒内取出您的银行卡，欢迎下次光临！");
                continueATM = false; // 用户选择退出

            }

        } while (continueATM);

        scan.close();

        System.out.println("您的最终余额为:" + balance);

    }
}
