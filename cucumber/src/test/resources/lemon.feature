Feature: 使用chrome浏览器访问百度搜索柠檬班论坛

  Scenario: 百度搜索testingpai
    Given 打开百度搜索
    When 输入 "谷歌"
    Then 显示 "Google - 百度百科"
#    Then 显示 "很抱歉"