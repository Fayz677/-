#include <stdio.h>


long long factorial(int n) {
    long long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}


long long derangements(int n) {
    if (n == 0) return 1; // !0 = 1
    if (n == 1) return 0; // !1 = 0

    long long derangement = 0;
    for (int i = 0; i <= n; i++) {
        derangement += (i % 2 == 0 ? 1 : -1) * factorial(n) / factorial(i);
    }
    return derangement;
}

int main() {
    int n;
    printf("有多少个字母？");
    scanf("%d", &n);

    long long result = derangements(n);
    printf("方式数量: %lld\n", result);

    return 0;
}