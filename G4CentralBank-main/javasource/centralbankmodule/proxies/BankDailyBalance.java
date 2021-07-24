// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package centralbankmodule.proxies;

public class BankDailyBalance
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject bankDailyBalanceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CentralBankModule.BankDailyBalance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		turnoverDate("turnoverDate"),
		previousBalance("previousBalance"),
		turnoverInFavor("turnoverInFavor"),
		turnoverInExpense("turnoverInExpense"),
		newBalance("newBalance"),
		BankDailyBalance_BillingAccount("CentralBankModule.BankDailyBalance_BillingAccount"),
		BankDailyBalance_TransferMessage("CentralBankModule.BankDailyBalance_TransferMessage");

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

	public BankDailyBalance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CentralBankModule.BankDailyBalance"));
	}

	protected BankDailyBalance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject bankDailyBalanceMendixObject)
	{
		if (bankDailyBalanceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CentralBankModule.BankDailyBalance", bankDailyBalanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CentralBankModule.BankDailyBalance");

		this.bankDailyBalanceMendixObject = bankDailyBalanceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'BankDailyBalance.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static centralbankmodule.proxies.BankDailyBalance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return centralbankmodule.proxies.BankDailyBalance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static centralbankmodule.proxies.BankDailyBalance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new centralbankmodule.proxies.BankDailyBalance(context, mendixObject);
	}

	public static centralbankmodule.proxies.BankDailyBalance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return centralbankmodule.proxies.BankDailyBalance.initialize(context, mendixObject);
	}

	public static java.util.List<centralbankmodule.proxies.BankDailyBalance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<centralbankmodule.proxies.BankDailyBalance> result = new java.util.ArrayList<centralbankmodule.proxies.BankDailyBalance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CentralBankModule.BankDailyBalance" + xpathConstraint))
			result.add(centralbankmodule.proxies.BankDailyBalance.initialize(context, obj));
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
	 * @return value of turnoverDate
	 */
	public final java.util.Date getturnoverDate()
	{
		return getturnoverDate(getContext());
	}

	/**
	 * @param context
	 * @return value of turnoverDate
	 */
	public final java.util.Date getturnoverDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.turnoverDate.toString());
	}

	/**
	 * Set value of turnoverDate
	 * @param turnoverdate
	 */
	public final void setturnoverDate(java.util.Date turnoverdate)
	{
		setturnoverDate(getContext(), turnoverdate);
	}

	/**
	 * Set value of turnoverDate
	 * @param context
	 * @param turnoverdate
	 */
	public final void setturnoverDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date turnoverdate)
	{
		getMendixObject().setValue(context, MemberNames.turnoverDate.toString(), turnoverdate);
	}

	/**
	 * @return value of previousBalance
	 */
	public final java.math.BigDecimal getpreviousBalance()
	{
		return getpreviousBalance(getContext());
	}

	/**
	 * @param context
	 * @return value of previousBalance
	 */
	public final java.math.BigDecimal getpreviousBalance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.previousBalance.toString());
	}

	/**
	 * Set value of previousBalance
	 * @param previousbalance
	 */
	public final void setpreviousBalance(java.math.BigDecimal previousbalance)
	{
		setpreviousBalance(getContext(), previousbalance);
	}

	/**
	 * Set value of previousBalance
	 * @param context
	 * @param previousbalance
	 */
	public final void setpreviousBalance(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal previousbalance)
	{
		getMendixObject().setValue(context, MemberNames.previousBalance.toString(), previousbalance);
	}

	/**
	 * @return value of turnoverInFavor
	 */
	public final java.math.BigDecimal getturnoverInFavor()
	{
		return getturnoverInFavor(getContext());
	}

	/**
	 * @param context
	 * @return value of turnoverInFavor
	 */
	public final java.math.BigDecimal getturnoverInFavor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.turnoverInFavor.toString());
	}

	/**
	 * Set value of turnoverInFavor
	 * @param turnoverinfavor
	 */
	public final void setturnoverInFavor(java.math.BigDecimal turnoverinfavor)
	{
		setturnoverInFavor(getContext(), turnoverinfavor);
	}

	/**
	 * Set value of turnoverInFavor
	 * @param context
	 * @param turnoverinfavor
	 */
	public final void setturnoverInFavor(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal turnoverinfavor)
	{
		getMendixObject().setValue(context, MemberNames.turnoverInFavor.toString(), turnoverinfavor);
	}

	/**
	 * @return value of turnoverInExpense
	 */
	public final java.math.BigDecimal getturnoverInExpense()
	{
		return getturnoverInExpense(getContext());
	}

	/**
	 * @param context
	 * @return value of turnoverInExpense
	 */
	public final java.math.BigDecimal getturnoverInExpense(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.turnoverInExpense.toString());
	}

	/**
	 * Set value of turnoverInExpense
	 * @param turnoverinexpense
	 */
	public final void setturnoverInExpense(java.math.BigDecimal turnoverinexpense)
	{
		setturnoverInExpense(getContext(), turnoverinexpense);
	}

	/**
	 * Set value of turnoverInExpense
	 * @param context
	 * @param turnoverinexpense
	 */
	public final void setturnoverInExpense(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal turnoverinexpense)
	{
		getMendixObject().setValue(context, MemberNames.turnoverInExpense.toString(), turnoverinexpense);
	}

	/**
	 * @return value of newBalance
	 */
	public final java.math.BigDecimal getnewBalance()
	{
		return getnewBalance(getContext());
	}

	/**
	 * @param context
	 * @return value of newBalance
	 */
	public final java.math.BigDecimal getnewBalance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.newBalance.toString());
	}

	/**
	 * Set value of newBalance
	 * @param newbalance
	 */
	public final void setnewBalance(java.math.BigDecimal newbalance)
	{
		setnewBalance(getContext(), newbalance);
	}

	/**
	 * Set value of newBalance
	 * @param context
	 * @param newbalance
	 */
	public final void setnewBalance(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal newbalance)
	{
		getMendixObject().setValue(context, MemberNames.newBalance.toString(), newbalance);
	}

	/**
	 * @return value of BankDailyBalance_BillingAccount
	 */
	public final centralbankmodule.proxies.BillingAccount getBankDailyBalance_BillingAccount() throws com.mendix.core.CoreException
	{
		return getBankDailyBalance_BillingAccount(getContext());
	}

	/**
	 * @param context
	 * @return value of BankDailyBalance_BillingAccount
	 */
	public final centralbankmodule.proxies.BillingAccount getBankDailyBalance_BillingAccount(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		centralbankmodule.proxies.BillingAccount result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BankDailyBalance_BillingAccount.toString());
		if (identifier != null)
			result = centralbankmodule.proxies.BillingAccount.load(context, identifier);
		return result;
	}

	/**
	 * Set value of BankDailyBalance_BillingAccount
	 * @param bankdailybalance_billingaccount
	 */
	public final void setBankDailyBalance_BillingAccount(centralbankmodule.proxies.BillingAccount bankdailybalance_billingaccount)
	{
		setBankDailyBalance_BillingAccount(getContext(), bankdailybalance_billingaccount);
	}

	/**
	 * Set value of BankDailyBalance_BillingAccount
	 * @param context
	 * @param bankdailybalance_billingaccount
	 */
	public final void setBankDailyBalance_BillingAccount(com.mendix.systemwideinterfaces.core.IContext context, centralbankmodule.proxies.BillingAccount bankdailybalance_billingaccount)
	{
		if (bankdailybalance_billingaccount == null)
			getMendixObject().setValue(context, MemberNames.BankDailyBalance_BillingAccount.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.BankDailyBalance_BillingAccount.toString(), bankdailybalance_billingaccount.getMendixObject().getId());
	}

	/**
	 * @return value of BankDailyBalance_TransferMessage
	 */
	public final java.util.List<businessbankmodule.proxies.TransferMessage> getBankDailyBalance_TransferMessage() throws com.mendix.core.CoreException
	{
		return getBankDailyBalance_TransferMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of BankDailyBalance_TransferMessage
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<businessbankmodule.proxies.TransferMessage> getBankDailyBalance_TransferMessage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<businessbankmodule.proxies.TransferMessage> result = new java.util.ArrayList<businessbankmodule.proxies.TransferMessage>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.BankDailyBalance_TransferMessage.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(businessbankmodule.proxies.TransferMessage.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of BankDailyBalance_TransferMessage
	 * @param bankdailybalance_transfermessage
	 */
	public final void setBankDailyBalance_TransferMessage(java.util.List<businessbankmodule.proxies.TransferMessage> bankdailybalance_transfermessage)
	{
		setBankDailyBalance_TransferMessage(getContext(), bankdailybalance_transfermessage);
	}

	/**
	 * Set value of BankDailyBalance_TransferMessage
	 * @param context
	 * @param bankdailybalance_transfermessage
	 */
	public final void setBankDailyBalance_TransferMessage(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<businessbankmodule.proxies.TransferMessage> bankdailybalance_transfermessage)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (businessbankmodule.proxies.TransferMessage proxyObject : bankdailybalance_transfermessage)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.BankDailyBalance_TransferMessage.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return bankDailyBalanceMendixObject;
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
			final centralbankmodule.proxies.BankDailyBalance that = (centralbankmodule.proxies.BankDailyBalance) obj;
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
		return "CentralBankModule.BankDailyBalance";
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
