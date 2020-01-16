# CHANGELOG-BETWEEN-UPSTREAM

* `datax.py`兼容python3
* elasticsearchwriter支持自定义日期类型
* elasticsearchwriter支持删除全部document但是保留mapping,支持删除整个index
* 扩展hdfswriter中的 `writeMode` 配置,增加 `truncate` 以及 `delete` 的支持
* 按需加载writer和reader插件
* 在CI中增加`mergeable`以防没有修改`CHANGELOG-BETWEEN-UPSTREAM.md`的PR被合并
* 将ErrorRecordChecker中的percentageLimit改成统一的样式,因为[同步统计][1]中的百分比也是`[0, 100]`的范围

---

[1]: https://github.com/alibaba/DataX/blob/7ec3fb68e507f997acd13dee5a6fc416559ae1b6/core/src/main/java/com/alibaba/datax/core/statistics/communication/CommunicationTool.java#L173-L176