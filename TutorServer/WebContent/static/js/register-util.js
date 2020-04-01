/**
 * 将不足10位的数值，转换为长度为10的字符串
 * @param {number} num 
 */
function getTenStr(num) {
	// 将num转换成字符串，根据字符串长度获得正确的数值位数
	var str = num + "";
	var len = str.length;
	// 根据字符串长度进行位数补全，补全到10位，不足位添0
	if(len < 10) {
		for(var i = 0; i < 10 - len; i++) {
			str = "0" + str;
		}
	}
	return str;
}

/**
 * 根据日期算出年龄
 * 获得"出生日期"输入框的值，格式为"yyyy-MM-dd"
 * @param select
 * @returns
 */
function getAgeByBirthday(birth) {
	// 对获得的"出生日期"字符串进行拆分，得到年、月、日的字符串
	var _year = birth.substring(0, birth.indexOf("-"));
	var _month = birth.substring(birth.indexOf("-") + 1, birth.lastIndexOf("-"));
	var _date = birth.substring(birth.lastIndexOf("-") + 1, birth.length);
	// 将年、月、日的字符串转换为相应的数值
	var y = parseInt(_year);
	var m = parseInt(_month) - 1;
	var d = parseInt(_date);
	// 获得"出生日期"的时间戳
	var birthTime = new Date(y, m, d).getTime();
	// 获得当前时间的时间戳
	var nowTime = new Date().getTime();
	// 计算出相差的时间
	var c = nowTime - birthTime;

	var age = Math.floor(c / (365 * 24 * 60 * 60 * 1000));
	if(age < 1) {
		age = Math.floor(c / (30 * 24 * 60 * 60 * 1000));
		if(age < 1) {
			age = Math.floor(c / (24 * 60 * 60 * 1000));
		}
	}
	// 为"年龄"输入框赋值
	return age;
}


// 格式化时间
// 调用例子： formatDate(new Date(放入时间戳))
function formatDate(now) {
	var year = now.getFullYear();
	var month = now.getMonth() + 1;
	var date = now.getDate();
	var hour = now.getHours();
	var minute = now.getMinutes();
	var second = now.getSeconds();
	return year + "-" + month + "-" + date;
}

//获取地址栏id
function getQueryString(name){
	var reg=new RegExp('(^|&)' + name + '=([^&]*)(&|$)','i');
	var r = window.location.search.substr(1).match(reg);
	if(r != null){
		return unescape(r[2]);
	}
	return null;
}
