//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    // Khai báo 2 biến width và height có kiểu float
    // 2 biến area và perimeter có kiểu float là diện tích và chu vi hình chữ nhật
    float width, height, area, perimeter;

    // Nhập dữ liệu
    System.out.print("Nhập chiều rộng của hình chữ nhật (width): ");
    width = scanner. nextFloat();

    System.out.print("Nhập chiều cao của hình chữ nhật (height): ");
    height = scanner.nextFloat();

    // Tính diện tích và chu vi
    // Sử dụng công thức để tính diện tích và chu vi của hình chữ nhật
    area = width * height;                    // Diện tích = rộng × cao
    perimeter = 2 * (width + height);         // Chu vi = 2 × (rộng + cao)

    // In kết quả diện tích và chu vi của hình chữ nhật lên màn hình
    System.out.println("\n--- Kết quả ---");
    System.out.println("Chiều rộng (width) = " + width);
    System.out.println("Chiều cao (height) = " + height);
    System. out.println("Diện tích (area) = " + area);
    System.out.println("Chu vi (perimeter) = " + perimeter);

    scanner.close();
}
