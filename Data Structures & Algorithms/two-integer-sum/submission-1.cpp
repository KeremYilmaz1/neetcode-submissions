#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) { // j=i+1 yapmaya gerek yok aynı elemanı kontrol etmemek için
                if (nums[i] + nums[j] == target) {
                    return {i, j};  // indexleri döndür
                }
            }
        }
        return {}; // çözüm bulunmazsa boş vector döner
    }
};
