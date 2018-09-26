<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:saxon="http://icl.com/saxon" exclude-result-prefixes="saxon">

	<xsl:variable name="bgcolor" select="'x00ffff'" />
	<xsl:variable name="fontcolor" select="'xff0080'" />

	<xsl:template match="/">
		<HTML>
		<HEAD>
			<TITLE>Customer List</TITLE>
		</HEAD>
		<BODY>
		</BODY>
		</HTML>
	</xsl:template>

	<xsl:template match="LIST">
		<xsl:sort select="ID" order="ascending" />
		<TABLE>
			<TR>
				<TD><xsl:number format="i" /></TD>
				<TD>
					NAME:<xsl:value-of select="NAME" /><BR />
					DATA:<xsl:value-of select="DATA" /><BR />				
				</TD>
			</TR>
		</TABLE>
		<HR />
	</xsl:template>
</xsl:transform>
