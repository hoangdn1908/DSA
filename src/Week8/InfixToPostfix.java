/**
 * Chuyển biểu thức trung tố (infix) sang hậu tố (postfix).
 */

package Week8;

// Lớp InfixToPostfix dùng để chuyển biểu thức trung tố sang hậu tố
class InfixToPostfix {
  // Biểu thức trung tố đầu vào
  String infix;

  public InfixToPostfix(String infix) {
    // Lưu lại biểu thức trung tố
    this.infix = infix;
  }

  // Hàm chuyển infix -> postfix
  public String convertToPostfix() {
    // Kết quả hậu tố
    String postfix = "";
    // Stack lưu toán tử và dấu ngoặc
    ArrayStack<Character> st = new ArrayStack<Character>();

    // Duyệt từng ký tự trong chuỗi infix
    for (int i = 0; i < infix.length(); i++) {
      char c = infix.charAt(i);

      // ===== TOÁN HẠNG & '(' =====

      // Nếu là chữ số -> toán hạng
      if (('0' <= c) && (c <= '9')) {
        // Đưa thẳng vào postfix + khoảng trắng
        postfix = postfix + c + " ";
      }

      // Nếu là '('
      if (c == '(') {
        // Đẩy vào stack để đánh dấu phạm vi ưu tiên
        st.push(c);
      }

      // ===== TOÁN TỬ + - * / =====

      if ((c == '+') || (c == '-') || (c == '*') || (c == '/')) {
        // Pop các toán tử trong stack có ưu tiên >= c (trừ '(')
        while (!st.isEmpty() && st.peek() != '(' && priority(st.peek()) >= priority(c)) {
          postfix = postfix + st.pop() + " ";
        }
        // Sau đó push toán tử hiện tại vào stack
        st.push(c);
      }

      // ===== DẤU NGOẶC PHẢI ')' =====

      if (c == ')') {
        // Pop toán tử cho đến khi gặp '('
        while (!st.isEmpty() && st.peek() != '(') {
          postfix = postfix + st.pop() + " ";
        }
        // Bỏ dấu '(' khỏi stack
        if (!st.isEmpty() && st.peek() == '(') {
          st.pop();
        }
      }
    }

    // Sau khi duyệt hết chuỗi:
    // Pop nốt các toán tử còn lại trong stack
    while (!st.isEmpty()) {
      postfix = postfix + st.pop() + " ";
    }

    // Trả về chuỗi hậu tố
    return postfix;
  }

  // Trả về độ ưu tiên của toán tử (số lớn hơn -> ưu tiên cao hơn)
  private static int priority(char c) {
    if (c == '(')
      return 1;      // thấp nhất, chỉ làm mốc
    if ((c == '+') || (c == '-'))
      return 2;      // cộng, trừ
    if ((c == '*') || (c == '/'))
      return 3;      // nhân, chia
    return 0;        // ký tự khác
  }
}