package com.saltedfish.contest;

import java.util.*;

public class LeetCode00031 {
    class Allocator {

        Map<Integer, List<Integer>> mIDMemM;

        PriorityQueue<Integer> freeList;

        public Allocator(int n) {
            freeList = new PriorityQueue<>();
            mIDMemM = new HashMap<>();
            for (int i = 0; i < n; i++) {
                freeList.add(i);
            }
        }

        public int allocate(int size, int mID) {
            if (size > freeList.size()) {
                return -1;
            }

            List<Integer> mIDMemList = mIDMemM.getOrDefault(mID, new ArrayList<>());
            int first = freeList.peek();
            for (int i = 0; i < size; i++) {
                int mem = freeList.poll();
                mIDMemList.add(mem);
                mIDMemM.put(mID, mIDMemList);
            }
            return first;
        }

        public int free(int mID) {
            List<Integer> mIDMemList = mIDMemM.getOrDefault(mID, new ArrayList<>());
            for (int x : mIDMemList) {
                freeList.add(x);
            }
            int size = mIDMemList.size();
            mIDMemM.remove(mID);
            return size;
        }
    }

    /**
     * 输入
     * ["Allocator", "allocate", "allocate", "allocate", "free", "allocate", "allocate", "allocate", "free", "allocate", "free"]
     * [[10], [1, 1], [1, 2], [1, 3], [2], [3, 4], [1, 1], [1, 1], [1], [10, 2], [7]]
     * 输出
     * [null, 0, 1, 2, 1, 3, 1, 6, 3, -1, 0]
     *
     * 解释
     * Allocator loc = new Allocator(10); // 初始化一个大小为 10 的内存数组，所有内存单元都是空闲的。
     * loc.allocate(1, 1); // 最左侧的块的第一个下标是 0 。内存数组变为 [1, , , , , , , , , ]。返回 0 。
     * loc.allocate(1, 2); // 最左侧的块的第一个下标是 1 。内存数组变为 [1,2, , , , , , , , ]。返回 1 。
     * loc.allocate(1, 3); // 最左侧的块的第一个下标是 2 。内存数组变为 [1,2,3, , , , , , , ]。返回 2 。
     * loc.free(2); // 释放 mID 为 2 的所有内存单元。内存数组变为 [1, ,3, , , , , , , ] 。返回 1 ，因为只有 1 个 mID 为 2 的内存单元。
     * loc.allocate(3, 4); // 最左侧的块的第一个下标是 3 。内存数组变为 [1, ,3,4,4,4, , , , ]。返回 3 。
     * loc.allocate(1, 1); // 最左侧的块的第一个下标是 1 。内存数组变为 [1,1,3,4,4,4, , , , ]。返回 1 。
     * loc.allocate(1, 1); // 最左侧的块的第一个下标是 6 。内存数组变为 [1,1,3,4,4,4,1, , , ]。返回 6 。
     * loc.free(1); // 释放 mID 为 1 的所有内存单元。内存数组变为 [ , ,3,4,4,4, , , , ] 。返回 3 ，因为有 3 个 mID 为 1 的内存单元。
     * loc.allocate(10, 2); // 无法找出长度为 10 个连续空闲内存单元的空闲块，所有返回 -1 。
     * loc.free(7); // 释放 mID 为 7 的所有内存单元。内存数组保持原状，因为不存在 mID 为 7 的内存单元。返回 0 。
     * @param args
     */
    public static void main(String[] args) {
        LeetCode0003.Allocator loc = new LeetCode0003().new Allocator(10);
        System.out.println(loc.allocate(1, 1)); // 最左侧的块的第一个下标是 0 。内存数组变为 [1, , , , , , , , , ]。返回 0 。);

        System.out.println(loc.allocate(1, 2)); // 最左侧的块的第一个下标是 1 。内存数组变为 [1,2, , , , , , , , ]。返回 1 。
        System.out.println(loc.allocate(1, 3)); // 最左侧的块的第一个下标是 2 。内存数组变为 [1,2,3, , , , , , , ]。返回 2 。
        System.out.println(loc.free(2)); // 释放 mID 为 2 的所有内存单元。内存数组变为 [1, ,3, , , , , , , ] 。返回 1 ，因为只有 1 个 mID 为 2 的内存单元。
        System.out.println(loc.allocate(3, 4)); // 最左侧的块的第一个下标是 3 。内存数组变为 [1, ,3,4,4,4, , , , ]。返回 3 。
        System.out.println(loc.allocate(1, 1)); // 最左侧的块的第一个下标是 1 。内存数组变为 [1,1,3,4,4,4, , , , ]。返回 1 。
        System.out.println(loc.allocate(1, 1)); // 最左侧的块的第一个下标是 6 。内存数组变为 [1,1,3,4,4,4,1, , , ]。返回 6 。
        System.out.println(loc.free(1)); // 释放 mID 为 1 的所有内存单元。内存数组变为 [ , ,3,4,4,4, , , , ] 。返回 3 ，因为有 3 个 mID 为 1 的内存单元。
        System.out.println(loc.allocate(10, 2)); // 无法找出长度为 10 个连续空闲内存单元的空闲块，所有返回 -1 。
        System.out.println(loc.free(7)); // 释放 mID 为 7 的所有内存单元。内存数组保持原状，因为不存在 mID 为 7 的内存单元。返回 0 。
    }
}
