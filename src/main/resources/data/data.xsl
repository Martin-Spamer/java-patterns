<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="text" encoding="UTF-8" />
<html>
<head><title>Expected Data</title></head>
<body>
<xsl:template match="/">

	<h2>Expected Data</h2>
		<xsl:for-each select="table">
		<table>
		    <tr>
		      <th>ColOne</th>
		      <th>ColTwo</th>
		      <th>ColThree</th>
		    </tr>
			<xsl:for-each select="record">
			<tr>
				<xsl:apply-templates select="field">
				<td><xsl:value-of select="field" /></td>
				</xsl:apply-templates>
			</tr>
			
			</xsl:for-each>
		</table>	
		</xsl:for-each>
	</xsl:template>
</body>
</html>
</xsl:stylesheet>
