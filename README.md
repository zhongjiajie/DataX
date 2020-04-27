![Datax-logo][logo]

<a href="https://github.com/zhongjiajie/DataX"><img alt="GitHub Actions status" src="https://github.com/zhongjiajie/DataX/workflows/Auto-Release/badge.svg"></a>

# 关于这个Fork

由于阿里维护DataX没有这么及时，但是很多人（包括我）还在使用DataX。使用过程中难免会发现一些问题，发现了问题我会从新编译使用，但看到社区有
小伙伴遇到同样的问题，所以就萌生出维护一个fork并且定期发布，并且希望有人可以一起维护

## 这个Fork和alibaba/DataX相比做了什么修改

具体有什么修改见[changelog][changelog]

## 是否会合并alibaba/DataX中新的commit

项目会定期合并alibaba/DataX中的commit，统一采用`git cherry -x <commit-hash>`的方式，保留原commit的hash值，方便用户溯源，合并之后
会自动编译并发布到[release][release]，详细的自动发布过程见[这个Fork如何发布](#这个Fork如何发布)

## 如何使用这个Fork的代码

* **想使用这个Fork**： 如果你仅仅想使用这个Fork的Datax，请直接到[release][release]页面下载最新版。几乎是最新代码的编译包，详见
  [这个Fork如何发布](#这个Fork如何发布)
* **想参与这个Fork共享**：如果你想参与这个Fork贡献，可以参考[想要提供帮助](#想要提供帮助)

## 这个Fork如何发布

这个Fork使用[Github Action][Gtihub-Action]自动化发布，每当master分支有新commit的时候就会触发自动化发布，大概一个小时就会发布到
[release][release]中。为了防止过多的release assert（每个commit产生一个），所以目前采用同一个tag发布（v0.0.2），详见[PR-20][PR-20]，
所以[release][release]仅会存在一个release信息，但是已经是最新代码的编译文件，请放心使用。

## 想要提供帮助

如果你觉得这个项目有点意思，且想要参与到项目建设/贡献，可以参考以下流程：
* 先Fork这个项目
* 将你的Fork拉到本地
* 在本地完成修改并提交到你的github
* 创建PR并将target branch 选择至 zhongjiajie/DataX
* 点击create创建PR

---

[logo]: https://github.com/alibaba/DataX/blob/master/images/DataX-logo.jpg
[release]: https://github.com/zhongjiajie/DataX/releases
[changelog]: https://github.com/zhongjiajie/DataX/blob/master/CHANGELOG-BETWEEN-UPSTREAM.md
[Gtihub-Action]: https://github.com/features/actions
[PR-20]: https://github.com/zhongjiajie/DataX/pull/20
