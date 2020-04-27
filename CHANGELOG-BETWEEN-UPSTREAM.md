# CHANGELOG-BETWEEN-UPSTREAM

* `datax.py`兼容python3
* elasticsearchwriter支持自定义日期类型
* elasticsearchwriter支持删除全部document但是保留mapping,支持删除整个index
* 扩展hdfswriter中的 `writeMode` 配置,增加 `truncate` 以及 `delete` 的支持
* 按需加载writer和reader插件
* 在CI中增加`mergeable`以防没有修改`CHANGELOG-BETWEEN-UPSTREAM.md`的PR被合并
* 修复HDFS reader读取ORC文件过大导致的丢数据问题,[ISSUE-527][1]
* 将 errorLimit 中的 percentage 统一成和日志提示进度中的 percentage 一致, 即 [0, 100] 的数字(去掉百分号)
* Revert了增加`mergeable`的commit,因为他的行为和预想的不一样
* 增加 HDFS reader 的 parquet 文件类型支持
* 规范日志文件名的命名
* HDFS-writer新增是否创建路径配置`crtPathNotExists`和文件写入人`user`
* 新增Github Action实现新PR合并到master自动发布
* 修改Github Action仅使用固定的tag发布防止release assert过大

---

[1]: https://github.com/alibaba/DataX/issues/527
