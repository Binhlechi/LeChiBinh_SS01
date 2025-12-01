//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    // Nhập tử số và mẫu số của hai phân số từ người dùng
    System.out.print("Nhập tử số 1 (a): ");
    int a = scanner.nextInt();

    System.out.print("Nhập mẫu số 1 (b): ");
    int b = scanner.nextInt();

    System.out.print("Nhập tử số 2 (c): ");
    int c = scanner.nextInt();

    System.out.print("Nhập mẫu số 2 (d): ");
    int d = scanner.nextInt();

    // Tính tổng của hai phân số theo công thức: a/b + c/d = (ad + bc) / bd
    int tuSoTong = a * d + b * c;      // Tử số tổng = ad + bc
    int mauSoTong = b * d;              // Mẫu số tổng = bd

    // In kết quả ra màn hình dưới dạng phân số (a/b)
    System.out.println("\nKết quả:");
    System.out.println(a + "/" + b + " + " + c + "/" + d + " = " + tuSoTong + "/" + mauSoTong);

    scanner.close();
}
