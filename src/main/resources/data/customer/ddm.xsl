<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet>
	<xsl:output method="text" />
	<xsl:template match="DDM-DATA">
		<xsl:apply-templates select="RECORD" />
	</xsl:template>

	<xsl:template match="TABLE">
		<xsl:for-each select="RECORD">
			<xsl:value-of select="TITLE" />
		</xsl:for-each>
	</xsl:template>

</xsl:stylesheet>
