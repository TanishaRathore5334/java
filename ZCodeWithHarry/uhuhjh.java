//public class uhuhjh {
//    public static void main(String[] args) {
//        n = 3;
//        m = 20;
//        p = [25, 24, 15];
//        w = [18, 15, 10];
//
//# Initialize table
//        T = [[0] * (m + 1) for _ in range(n + 1)]
//
//# Fill the table
//        for i in range(1, n + 1):
//        for j in range(1, m + 1):
//        if w[i - 1] <= j:
//        T[i][j] = max(T[i - 1][j], p[i - 1] + T[i - 1][j - w[i - 1]])
//        else:
//        T[i][j] = T[i - 1][j]
//
//# Backtrack to find selected items
//        selected_items = []
//        i, j = n, m
//        while i > 0 and j > 0:
//        if T[i][j] != T[i - 1][j]:
//        selected_items.append(i)
//        j -= w[i - 1]
//        i -= 1
//
//# Print results
////        print("Maximum profit:", T[n][m])
////        print("Selected items:", selected_items)
//
//    }
//}
