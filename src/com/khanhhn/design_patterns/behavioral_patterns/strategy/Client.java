package com.khanhhn.design_patterns.behavioral_patterns.strategy;

public class Client {
    /**
     * </p>
     * Strategy Pattern là một trong những Pattern thuộc nhóm hành vi(Behavior Pattern).
     * Nó cho phép định nghĩa tập hợp các thuật toán, đóng gói từng thuật toán lại, và
     * dễ dàng thay đổi linh hoạt các thuật toán bên trong object. Strategy cho phép
     * thuật toán biến đổi độc lập khi người dùng sử dụng chúng.
     *
     * Ý nghĩa thực sự của Strategy Pattern là giúp tách rời phần xử lý một chức năng cụ thể
     * ra khỏi đối tượng. Sau đó tạo ra một tập hợp các thuật toán để xử lý chức năng đó và lựa
     * chọn thuật toán nào mà chúng ta thấy đúng đắn nhất khi thực thi chương trình. Mẫu thiết kế
     * này thường được sử dụng để thay thế cho sự kế thừa, khi muốn chấm dứt việc theo dõi và
     * chỉnh sửa một chức năng qua nhiều lớp con
     * <p/>
     * @param args
     */
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Java Core");
        sortedList.add("Java Design Patter");
        sortedList.add("Java Library");
        sortedList.add("Java Framework");
        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}
