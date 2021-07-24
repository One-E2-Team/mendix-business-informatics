// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package centralbankmodule.proxies;

public class BankBillingAccountStatusReport
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject bankBillingAccountStatusReportMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CentralBankModule.BankBillingAccountStatusReport";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		timestamp("timestamp"),
		BankBillingAccountStatusReport_BillingAccount("CentralBankModule.BankBillingAccountStatusReport_BillingAccount"),
		DocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport("CentralBankModule.DocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport");

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

	public BankBillingAccountStatusReport(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CentralBankModule.BankBillingAccountStatusReport"));
	}

	protected BankBillingAccountStatusReport(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject bankBillingAccountStatusReportMendixObject)
	{
		if (bankBillingAccountStatusReportMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CentralBankModule.BankBillingAccountStatusReport", bankBillingAccountStatusReportMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CentralBankModule.BankBillingAccountStatusReport");

		this.bankBillingAccountStatusReportMendixObject = bankBillingAccountStatusReportMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'BankBillingAccountStatusReport.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static centralbankmodule.proxies.BankBillingAccountStatusReport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return centralbankmodule.proxies.BankBillingAccountStatusReport.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static centralbankmodule.proxies.BankBillingAccountStatusReport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new centralbankmodule.proxies.BankBillingAccountStatusReport(context, mendixObject);
	}

	public static centralbankmodule.proxies.BankBillingAccountStatusReport load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return centralbankmodule.proxies.BankBillingAccountStatusReport.initialize(context, mendixObject);
	}

	public static java.util.List<centralbankmodule.proxies.BankBillingAccountStatusReport> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<centralbankmodule.proxies.BankBillingAccountStatusReport> result = new java.util.ArrayList<centralbankmodule.proxies.BankBillingAccountStatusReport>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CentralBankModule.BankBillingAccountStatusReport" + xpathConstraint))
			result.add(centralbankmodule.proxies.BankBillingAccountStatusReport.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of timestamp
	 */
	public final java.util.Date gettimestamp()
	{
		return gettimestamp(getContext());
	}

	/**
	 * @param context
	 * @return value of timestamp
	 */
	public final java.util.Date gettimestamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.timestamp.toString());
	}

	/**
	 * Set value of timestamp
	 * @param timestamp
	 */
	public final void settimestamp(java.util.Date timestamp)
	{
		settimestamp(getContext(), timestamp);
	}

	/**
	 * Set value of timestamp
	 * @param context
	 * @param timestamp
	 */
	public final void settimestamp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timestamp)
	{
		getMendixObject().setValue(context, MemberNames.timestamp.toString(), timestamp);
	}

	/**
	 * @return value of BankBillingAccountStatusReport_BillingAccount
	 */
	public final centralbankmodule.proxies.BillingAccount getBankBillingAccountStatusReport_BillingAccount() throws com.mendix.core.CoreException
	{
		return getBankBillingAccountStatusReport_BillingAccount(getContext());
	}

	/**
	 * @param context
	 * @return value of BankBillingAccountStatusReport_BillingAccount
	 */
	public final centralbankmodule.proxies.BillingAccount getBankBillingAccountStatusReport_BillingAccount(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		centralbankmodule.proxies.BillingAccount result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BankBillingAccountStatusReport_BillingAccount.toString());
		if (identifier != null)
			result = centralbankmodule.proxies.BillingAccount.load(context, identifier);
		return result;
	}

	/**
	 * Set value of BankBillingAccountStatusReport_BillingAccount
	 * @param bankbillingaccountstatusreport_billingaccount
	 */
	public final void setBankBillingAccountStatusReport_BillingAccount(centralbankmodule.proxies.BillingAccount bankbillingaccountstatusreport_billingaccount)
	{
		setBankBillingAccountStatusReport_BillingAccount(getContext(), bankbillingaccountstatusreport_billingaccount);
	}

	/**
	 * Set value of BankBillingAccountStatusReport_BillingAccount
	 * @param context
	 * @param bankbillingaccountstatusreport_billingaccount
	 */
	public final void setBankBillingAccountStatusReport_BillingAccount(com.mendix.systemwideinterfaces.core.IContext context, centralbankmodule.proxies.BillingAccount bankbillingaccountstatusreport_billingaccount)
	{
		if (bankbillingaccountstatusreport_billingaccount == null)
			getMendixObject().setValue(context, MemberNames.BankBillingAccountStatusReport_BillingAccount.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.BankBillingAccountStatusReport_BillingAccount.toString(), bankbillingaccountstatusreport_billingaccount.getMendixObject().getId());
	}

	/**
	 * @return value of DocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport
	 */
	public final centralbankmodule.proxies.DocumentBankBillingAccountStatusReport getDocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport() throws com.mendix.core.CoreException
	{
		return getDocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport(getContext());
	}

	/**
	 * @param context
	 * @return value of DocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport
	 */
	public final centralbankmodule.proxies.DocumentBankBillingAccountStatusReport getDocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		centralbankmodule.proxies.DocumentBankBillingAccountStatusReport result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport.toString());
		if (identifier != null)
			result = centralbankmodule.proxies.DocumentBankBillingAccountStatusReport.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport
	 * @param documentbankbillingaccountstatusreport_bankbillingaccountstatusreport
	 */
	public final void setDocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport(centralbankmodule.proxies.DocumentBankBillingAccountStatusReport documentbankbillingaccountstatusreport_bankbillingaccountstatusreport)
	{
		setDocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport(getContext(), documentbankbillingaccountstatusreport_bankbillingaccountstatusreport);
	}

	/**
	 * Set value of DocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport
	 * @param context
	 * @param documentbankbillingaccountstatusreport_bankbillingaccountstatusreport
	 */
	public final void setDocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport(com.mendix.systemwideinterfaces.core.IContext context, centralbankmodule.proxies.DocumentBankBillingAccountStatusReport documentbankbillingaccountstatusreport_bankbillingaccountstatusreport)
	{
		if (documentbankbillingaccountstatusreport_bankbillingaccountstatusreport == null)
			getMendixObject().setValue(context, MemberNames.DocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DocumentBankBillingAccountStatusReport_BankBillingAccountStatusReport.toString(), documentbankbillingaccountstatusreport_bankbillingaccountstatusreport.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return bankBillingAccountStatusReportMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final centralbankmodule.proxies.BankBillingAccountStatusReport that = (centralbankmodule.proxies.BankBillingAccountStatusReport) obj;
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
		return "CentralBankModule.BankBillingAccountStatusReport";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}