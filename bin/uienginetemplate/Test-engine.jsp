














<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/public/include/default.jsp"%>
<html>
<head>

<title>Test04</title>
</head>

<body>
	<form id="Form1" name="" action="" method="">
		<div id="Div2" name="" data-options="" class="" title="" align=""
			style="">
			<table id="TableLayout2" style="">
				<tr id="TR4" height="30">
					<td width="160" align=""><label id="Label6" name=""
						style="width: 32px; height: 20px">用户 </label></td>
					<td width="160" align=""><input
						class="easyui-validatebox textbox" id="Text1" type="text" name=""
						onblur="3" onfocus="2" onload="1" onclick="1" onchange="1"></input>
						<table id="TableLayout2" style="">
							<tr id="TR3" height="30">
								<td width="160" align=""></td>
								<td width="160" align=""></td>
							</tr>
							<tr id="TR4" height="30">
								<td width="160" align=""></td>
								<td width="160" align=""></td>
							</tr>
						</table></td>
				</tr>
				<tr id="TR5" height="30">
					<td width="160" align=""></td>
					<td width="160" align="">
						<!-- sssss --> <a href="javascript:void(0)" id="Button2" name=""
						class="" style="width: 75px; height: 24px"
						data-options="	
					
			">登录</a>
					</td>
				</tr>
				<tr id="$row.getAttributeValue('htmlId')" height="30">
				</tr>
			</table>
		</div>
		<div id="Panel2" name="" data-options="" class="easyui-panel" title=""
			align="" style="">
			<table id="TableLayout4" style="">
				<tr id="TR9" height="30">
					<td width="160" align=""><label id="Label8" name=""
						style="width: 32px; height: 20px">职业 </label></td>
					<td width="298" align=""><select id="Select1" name=""
						class=""
						data-options="		    	    		    		    		    		textField:'$attributeValue',
	
					
			">
							<option value="" checked="true">--请选择--</option>
					</select></td>
				</tr>
				<tr id="TR10" height="30">
					<td width="160" align=""><label id="Label9" name=""
						style="width: 32px; height: 20px">岗位 </label></td>
					<td width="298" align=""><input
						class="easyui-validatebox textbox" id="Text2" type="text" name=""></input>
					</td>
				</tr>
				<tr id="TR11" height="86">
					<td width="160" align=""><label id="Label23" name=""
						style="width: 50px; height: 20px">自我介绍 </label></td>
					<td width="298" align=""><textarea id="TextArea2" name=""
							rows="" cols="" style="width: 207px; height: 75px"></textarea>
					</td>
				</tr>
			</table>
		</div>
		<table id="TableLayout5" style="">
			<tr id="TR12" height="30">
				<td width="160" align=""><label id="Label11" name=""
					style="width: 32px; height: 20px">爱好 </label></td>
				<td width="228" align=""><input id="CheckBox1" name=""
					type="checkbox" value="CheckBox" class="" />CheckBox
				</td>
				<td width="160" align=""><input id="CheckBox2" name=""
					type="checkbox" value="CheckBox" class="" />CheckBox
				</td>
				<td width="160" align=""></td>
			</tr>
			<tr id="TR13" height="30">
				<td width="160" align=""><label id="Label12" name=""
					style="width: 32px; height: 20px">性别 </label></td>
				<td width="228" align=""><input id="Radio1" name=""
					type="radio" value="1" checked="checked" class="">lable1
					<input id="Radio2" name="" type="radio" value="2" class="">lable2
				</td>
				<td width="160" align=""><label id="Label14" name=""
					style="width: 32px; height: 20px">生日 </label></td>
				<td width="160" align=""><input id="DateBox1" name=""
					type="text" value="" class="" data-options="		    		
	
					
			" />
				</td>
			</tr>
			<tr id="$row.getAttributeValue('htmlId')" height="30">
				<td width="160" align=""><label id="Label16" name=""
					style="width: 32px; height: 20px">附件 </label></td>
				<td width="228" align=""><input id="File1" name="" type="file"
					classId="" style="width: 207px; height: 24px" /></td>
				<td width="160" align=""><label id="Label15" name=""
					style="width: 32px; height: 20px">邮箱 </label></td>
				<td width="160" align=""><a href="#" id="Hyperlink1" name=""
					class="">HyperLink</a></td>
			</tr>
		</table>
		<table id="DataTable7" name="" class=""
			data-options="checkOnSelect:true,	
					
			">
			<thead>
				<tr>
					<th data-options=""></th>

					<th data-options=""></th>

					<th data-options=""></th>

					<th data-options=""></th>

					<th data-options=""></th>

					<th data-options=""></th>

				</tr>
			</thead>
		</table>
	</form>
</body>
</html>



