<%--
  User: 57140
  Date: 2018/3/21
  Time: 13:52
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" data-options="fit:true">
    <form class="communityForm" id="communityAddForm" name="communityAddForm" method="post">
        <table style="width:50%;">
            <tr>
                <td class="label">小区名：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="plot" name="plot"
                           data-options="required:true" style="width:100%">
                </td>
            </tr>
            <tr>
                <td class="label">楼栋号：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="building" name="building"
                           data-options="required:true" style="width:100%">
                </td>
            </tr>
            <tr>
                <td class="label">单元号：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="element" name="element"
                           data-options="required:true" style="width:100%">
                </td>
            </tr>
            <tr>
                <td class="label">房间号：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="roomnum" name="roomnum"
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
        $('#communityAddForm').form('submit', {
            //表单提交后交给谁处理
            url: 'community/communityAdd',
            //表单提交成功后触发，而非item处理成功后触发
            success: function (data) {
                data = JSON.parse(data);
                if (data.success) {
                    $.messager.alert('消息', data.message, 'info');
                    ttshop.closeTabs("新增小区")
                    ttshop.addTabs('查询小区', 'community_list');
                }
            }
        });
    }
    function clearForm() {
      $("#communityAddForm").form('clear');
    }
</script>
