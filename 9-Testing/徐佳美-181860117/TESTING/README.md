# 9-Testing

作业8对葫芦娃进行了排序和性别的划分，作业9在此基础上对算法进行测试

测试类为CalabashCollectionTest,

开始测试前，生成葫芦娃数组，一共10个葫芦娃，名字从a-j,性别依次为男女。

总共4个测试，包括对性别，葫芦娃类自带的排序，CalabashCollection类正序比较器和逆序比较器的排序。

用断言进行测试，按性别分开后容器内都是同一性别的葫芦，排序测试用断言对每个位置的葫芦的 名字进行比对。

测试结束后进行清理。