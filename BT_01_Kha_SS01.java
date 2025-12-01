//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    // Nhập bán kính từ người dùng
    System.out.print("Nhập bán kính hình tròn: ");
    double radius = scanner. nextDouble();

    // Tính diện tích hình tròn theo công thức A = πr²
    double area = Math.PI * radius * radius;

    // In kết quả ra màn hình
    System.out.println("Diện tích hình tròn được tính bằng công thức:");
    System.out.println("A = πr²");
    System.out.println("Trong đó:");
    System.out.println("• A là diện tích.");
    System.out.println("• r là bán kính.");
    System.out.println("\nVới bán kính r = " + radius);
    System.out.println("Diện tích A = " + area);

    scanner.close();
}
