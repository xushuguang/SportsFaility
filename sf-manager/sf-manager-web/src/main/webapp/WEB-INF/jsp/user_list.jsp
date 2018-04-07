<%--
  User: 57140
  Date: 2018/3/21
  Time: 14:02
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<div id="userListToolbar">
    <div>
        <button onclick="editor()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>
<%--容器放好--%>
<table id="dgUsers"></table>
<%--通过js代码来渲染容器--%>
<script>
    //点击编辑按钮动作
    function editor(){
        var row = $('#dgUsers').datagrid('getSelected');
        if (row.length == 0) {
            $.messager.alert('警告', '请选中至少一条记录！', 'warning');
            return;
        }
        sessionStorage.setItem("row",row);
        ttshop.addTabs("详情",'sf_details');
    }
    function remove() {
        //debugger; //尤其可以使用这种嵌套的页面
        //取到客户选中的记录集合
        var rows = $('#dgUsers').datagrid('getSelections');
        if (rows.length == 0) {
            $.messager.alert('警告', '请选中至少一条记录！', 'warning');
            return;
        }
        $.messager.confirm('确认', '您确定要删除记录吗？', function (r) {
            if (r) {
                //客户已经点击“确定”按钮
                //定义一个空的数组，用来存放ID的集合
                var ids = [];
                //遍历的是客户选中的记录集合
                for (var i = 0; i < rows.length; i++) {
                    ids.push(rows[i].id);
                }
                //发出ajax请求
                //$.ajax() $.post() $.get()
                $.post(
                    //url，提交给后台谁去处理
                    'community/delete',
                    //data，提交什么到后台，ids
                    {'ids[]': ids},
                    //callback,相当于$.ajax中success
                    function (data) {
                        if (data > 0) {
                            $('#dgCommunitys').datagrid('reload');
                        }
                    }
                );
            }

        });
    }
    //初始化数据表格代码
    $('#dgUsers').datagrid({
        //数据表格的标题
        title: '查询用户列表',
        //显示行号
        rownumbers: true,
        //允许多列排序
        multiSort: true,
        //添加工具栏
        toolbar: '#userListToolbar',
        //初始化页面数据条数
        pageSize: 20,
        //在设置分页属性的时候 初始化页面大小选择列表
        pageList: [20, 50, 100],
        //请求服务器端数据
        url: 'user/listUserVo',
        //请求方式，默认是POST
        method: 'get',
        //是否显示分页工具栏
        pagination: true,
        //自适应父容器
        fit: true,
        //列属性
        columns: [[
            {field: 'ck', checkbox: true},
            {field: 'username', title: '用户名', sortable: true},
            {field: 'mobile', title: '手机号码'},
            {field: 'address', title: '地址'},
        ]]
    });
</script>
