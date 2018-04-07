<%--
  User: 57140
  Date: 2018/3/21
  Time: 13:52
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" data-options="fit:true">
    <form class="sfForm" id="sfAddForm" name="sfAddForm" method="post">
        <table style="width:50%;">
            <tr>
                <td class="label">设施类别：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="category" name="category"
                           data-options="required:true" style="width:100%">
                </td>
            </tr>
            <tr>
                <td class="label">设施名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="name" name="name"
                           data-options="required:true" style="width:100%">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">保存
                    </button>
                    <button onclick="clearForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>
                </td>
            </tr>
        </table>
    </form>
</div>
<script>
    //表单提交动作
    function submitForm() {
        $('#sfAddForm').form('submit', {
            //表单提交后交给谁处理
            url: 'sf/sfAdd',
            //表单提交成功后触发，而非item处理成功后触发
            success: function (data) {
                data = JSON.parse(data);
                if (data.success) {
                    $.messager.alert('消息', data.message, 'info');
                    ttshop.closeTabs("新增体育设施")
                    ttshop.addTabs('查询体育设施', 'sf_list');
                }
            }
        });
    }
    function clearForm() {
        $("#sfAddForm").form('clear');
    }
</script>
