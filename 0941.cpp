//
// Created by ShengyunYu on 2019/4/24.
//

#include "common.h"

class Solution {
public:
    bool validMountainArray(vector<int>& A) {
        int i = 0;
        int N = A.size();
        while (i + 1 < N && A[i] < A[i + 1])
            i++;
        if (i == 0 || i == N - 1)
            return false;

        while (i + 1 < N && A[i] > A[i + 1])
            i++;
        return i == N - 1;
    }
};


int main(int argc, char ** argv){
    Solution s;
    vector<int> v{0,3,2,1};
    vector<int> v1{3,5,5};
    cout << s.validMountainArray(v) << endl;
}