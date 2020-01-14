# CHANGELOG-BETWEEN-UPSTREAM

* `datax.py`兼容python3
* elasticsearchwriter支持自定义日期类型
* elasticsearchwriter支持删除全部document但是保留mapping,支持删除整个index
* 扩展hdfswriter中的 `writeMode` 配置,增加 `truncate` 以及 `delete` 的支持
* 按需加载writer和reader插件
