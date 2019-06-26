<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        ul, ol {
            list-style: none;
        }

        body {
            font-family: "Helvetica Neue", Helvetica, Arial, "Lucida Grande",
            sans-serif;
        }

        .tab-head {
            margin-left: 48%;
            margin-bottom: 10px;

        }



        h2 {
            border-bottom: solid #02aaf1 2px;
            width: 200px;
            height: 25px;
            margin: 0;
            float: left;
            text-align: center;
            font-size: 16px;
        }

        .selected {
            color: #FFFFFF;
            background-color: #02aaf1;
        }

        .show {
            clear: left;
            display: block;
            margin-left: 30%;
            width: 50%;
        }



        .new-btn-login-sp {
            padding: 1px;
            display: inline-block;
            width: 75%;
        }

        .new-btn-login {
            background-color: #02aaf1;
            color: #FFFFFF;
            font-weight: bold;
            border: none;
            width: 100%;
            height: 30px;
            border-radius: 5px;
            font-size: 16px;
        }

        #main {
            width: 100%;
            margin: 0 auto;
            font-size: 14px;
        }


        .content {
            margin-top: 5px;

        }

        .content dt {
            width: 100px;
            display: inline-block;
            float: left;
            margin-left: 20px;
            color: #666;
            font-size: 13px;
            margin-top: 8px;
        }

        .content dd {
            margin-left: 120px;
            margin-bottom: 5px;
        }

        .content dd input {
            width: 85%;
            height: 28px;
            border: 0;
            -webkit-border-radius: 0;
            -webkit-appearance: none;
        }


        .foot-ul li {
            width: 100%;
            text-align: center;
            color: #666;
        }

        .note-help {
            color: #999999;
            font-size: 12px;
            line-height: 130%;
            margin-top: 5px;
            width: 100%;
            display: block;
        }

        #btn-dd {
            margin: 20px;
            text-align: center;
        }



        .one_line {
            display: block;
            height: 1px;
            border: 0;
            border-top: 1px solid #eeeeee;
            width: 100%;
            margin-left: 20px;
        }

        .am-header h1 {
            -webkit-box-flex: 1;
            -ms-flex: 1;
            box-flex: 1;
            line-height: 18px;
            text-align: center;
            font-size: 18px;
            font-weight: 300;
            color: #fff;
        }
    </style>
</head>
<body>
<div id="main">
    <div id="tabhead" class="tab-head">
        <h2 id="tab1" class="selected" name="tab">交易结果</h2>
    </div>
    <form name=alipayment action="/reading/index" method=get
          target="_blank">
        <div id="body1" class="show" name="divcontent">
            <dl class="content">
                <dt>商户订单号 ：</dt>
                <dd>
                    <input id="WIDout_trade_no" name="WIDout_trade_no" value="${out_trade_no}" />
                </dd>
                <hr class="one_line">
                <dt>支付宝交易号 ：</dt>
                <dd>
                    <input id="WIDsubject" name="WIDsubject" value="${trade_no}"/>
                </dd>
                <hr class="one_line">
                <dt>付款金额 ：</dt>
                <dd>
                    <input id="WIDtotal_amount" name="WIDtotal_amount" value="${total_amount}"/>
                </dd>
                <hr class="one_line">
                <dt></dt>
                <dd id="btn-dd">
						<span class="new-btn-login-sp">
							<button class="new-btn-login" type="submit"
                                    style="text-align: center;" onclick="click()">确定</button>
						</span> <span class="note-help">如果您点击“确定”按钮，即表示您同意该次的执行操作。</span>
                </dd>
            </dl>
        </div>
    </form>
</div>
</body>
</html>