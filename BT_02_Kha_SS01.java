//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    // Khai báo 2 biến kiểu số nguyên int và nhập giá trị
    System.out.print("Nhập số thứ nhất (firstNumber): ");
    int firstNumber = scanner.nextInt();

    System.out.print("Nhập số thứ hai (secondNumber): ");
    int secondNumber = scanner.nextInt();

    // Thực hiện các phép toán
    int tong = firstNumber + secondNumber;           // Tổng
    int hieu = firstNumber - secondNumber;           // Hiệu
    int tich = firstNumber * secondNumber;           // Tích
    int thuong = firstNumber / secondNumber;         // Thương (phép chia nguyên)
    int phanDu = firstNumber % secondNumber;         // Phần dư

    // In giá trị 2 biến và kết quả các phép tính ra màn hình
    System. out.println("\n--- Kết quả ---");
    System.out.println("firstNumber = " + firstNumber);
    System.out.println("secondNumber = " + secondNumber);
    System.out.println("Tổng = " + tong);
    System.out.println("Hiệu = " + hieu);
    System.out.println("Tích = " + tich);
    System.out. println("Thương = " + thuong);
    System.out.println("Phần dư = " + phanDu);

    scanner.close();
}
