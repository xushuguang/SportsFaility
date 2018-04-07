<%--
  User: 57140
  Date: 2018/3/21
  Time: 14:02
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<div id="communityListToolbar">
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="editor()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>
<%--容器放好--%>
<table id="dgCommunitys"></table>
<%--通过js代码来渲染容器--%>
<script>
    //各个按钮的JS动作
    function add() {
        ttshop.addTabs('新增小区', 'community_add');
    }
    //点击编辑按钮动作
    function editor(){
        var row = $('#dgCommunitys').datagrid('getSelected');
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
        var rows = $('#dgCommunitys').datagrid('getSelections');
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
    $('#dgCommunitys').datagrid({
        //数据表格的标题
        title: '查询小区列表',
        //显示行号
        rownumbers: true,
        //允许多列排序
        multiSort: true,
        //添加工具栏
        toolbar: '#communityListToolbar',
        //初始化页面数据条数
        pageSize: 20,
        //在设置分页属性的时候 初始化页面大小选择列表
        pageList: [20, 50, 100],
        //请求服务器端数据
        url: 'community/listCommunity',
        //请求方式，默认是POST
        method: 'get',
        //是否显示分页工具栏
        pagination: true,
        //自适应父容器
        fit: true,
        //列属性
        columns: [[
            {field: 'ck', checkbox: true},
            {field: 'id', title: '编号', sortable: true},
            {field: 'plot', title: '小区名', sortable: true},
            {field: 'building', title: '楼栋号'},
            {field: 'element', title: '单元号'},
            {field: 'roomnum', title: '房间号'}
        ]]
    });
</script>
