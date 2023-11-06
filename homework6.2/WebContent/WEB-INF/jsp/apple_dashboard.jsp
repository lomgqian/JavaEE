<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Apple Dashboard</title>
    <script src="js/echarts.js"></script>
</head>
<body>
    <div id="appleDashboard" style="width: 600px; height: 400px;"></div>
    <script type="text/javascript">
    var applePrice = ${apple.applePrice};
    var appleName = '${apple.appleName}';
    
    var chartContainer = document.getElementById('appleDashboard');
    var chart = echarts.init(chartContainer);
    
    var option = {
            series: [{
                type: 'gauge',
                detail: {formatter: '{value}'},
                data: [{value: applePrice, name: 'Apple Price'}]
            }]
        };


        chart.setOption(option);
    </script>
</body>
</html>
