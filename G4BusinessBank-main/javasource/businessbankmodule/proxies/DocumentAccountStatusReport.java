// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package businessbankmodule.proxies;

public class DocumentAccountStatusReport extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BusinessBankModule.DocumentAccountStatusReport";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		DocumentAccountStatusReport_AccountStatusReport("BusinessBankModule.DocumentAccountStatusReport_AccountStatusReport");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DocumentAccountStatusReport(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BusinessBankModule.DocumentAccountStatusReport"));
	}

	protected DocumentAccountStatusReport(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject documentAccountStatusReportMendixObject)
	{
		super(context, documentAccountStatusReportMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("BusinessBankModule.DocumentAccountStatusReport", documentAccountStatusReportMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BusinessBankModule.DocumentAccountStatusReport");
	}

	/**
	 * @deprecated Use 'DocumentAccountStatusReport.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static businessbankmodule.proxies.DocumentAccountStatusReport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return businessbankmodule.proxies.DocumentAccountStatusReport.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static businessbankmodule.proxies.DocumentAccountStatusReport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new businessbankmodule.proxies.DocumentAccountStatusReport(context, mendixObject);
	}

	public static businessbankmodule.proxies.DocumentAccountStatusReport load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return businessbankmodule.proxies.DocumentAccountStatusReport.initialize(context, mendixObject);
	}

	public static java.util.List<businessbankmodule.proxies.DocumentAccountStatusReport> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<businessbankmodule.proxies.DocumentAccountStatusReport> result = new java.util.ArrayList<businessbankmodule.proxies.DocumentAccountStatusReport>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//BusinessBankModule.DocumentAccountStatusReport" + xpathConstraint))
			result.add(businessbankmodule.proxies.DocumentAccountStatusReport.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of DocumentAccountStatusReport_AccountStatusReport
	 */
	public final businessbankmodule.proxies.AccountStatusReport getDocumentAccountStatusReport_AccountStatusReport() throws com.mendix.core.CoreException
	{
		return getDocumentAccountStatusReport_AccountStatusReport(getContext());
	}

	/**
	 * @param context
	 * @return value of DocumentAccountStatusReport_AccountStatusReport
	 */
	public final businessbankmodule.proxies.AccountStatusReport getDocumentAccountStatusReport_AccountStatusReport(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		businessbankmodule.proxies.AccountStatusReport result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DocumentAccountStatusReport_AccountStatusReport.toString());
		if (identifier != null)
			result = businessbankmodule.proxies.AccountStatusReport.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DocumentAccountStatusReport_AccountStatusReport
	 * @param documentaccountstatusreport_accountstatusreport
	 */
	public final void setDocumentAccountStatusReport_AccountStatusReport(businessbankmodule.proxies.AccountStatusReport documentaccountstatusreport_accountstatusreport)
	{
		setDocumentAccountStatusReport_AccountStatusReport(getContext(), documentaccountstatusreport_accountstatusreport);
	}

	/**
	 * Set value of DocumentAccountStatusReport_AccountStatusReport
	 * @param context
	 * @param documentaccountstatusreport_accountstatusreport
	 */
	public final void setDocumentAccountStatusReport_AccountStatusReport(com.mendix.systemwideinterfaces.core.IContext context, businessbankmodule.proxies.AccountStatusReport documentaccountstatusreport_accountstatusreport)
	{
		if (documentaccountstatusreport_accountstatusreport == null)
			getMendixObject().setValue(context, MemberNames.DocumentAccountStatusReport_AccountStatusReport.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DocumentAccountStatusReport_AccountStatusReport.toString(), documentaccountstatusreport_accountstatusreport.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final businessbankmodule.proxies.DocumentAccountStatusReport that = (businessbankmodule.proxies.DocumentAccountStatusReport) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "BusinessBankModule.DocumentAccountStatusReport";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
