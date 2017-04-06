boolean call() {
	boolean result = env.BRANCH_NAME == 'master'
	println "Is the current branch (${env.BRANCH_NAME}) the branch master? ${result}"
	return result
}
