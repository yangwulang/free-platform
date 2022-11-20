import { Message, Notice, Modal } from 'view-ui-plus';
const close = {
  // 关闭消息提示
  removeMessage() {
    Message.destroy();
  },
  // 关闭对话框
  removeModal() {
    Modal.remove();
  },
  // 关闭通知
  closeNotice(name) {
    // 没有传递name，关闭全部信息通知
    if (!name) {
      Notice.destroy();
    } else {
      Notice.close(name);
    }
  },
};

const method = {
  /**
   * 全局提示
   * @param content 提示内容（默认为消息提示）
   * @param onClose 关闭时的回调函数
   * @param param 其他配置（可参照iview官网）
   * @param type 类型
   */
  message: (content = '消息提示', param = {}, onClose = () => {}, type) => {
    Message[type]({
      content,
      ...param,
      onClose,
    });
  },
  /**
   * 对话框
   * @param title 对话框标题
   * @param content 对话框内容
   * @param onOk 点击确定回调
   * @param onCancel 点击取消回调
   * @param param 其他配置
   * @param type 类型
   */
  modal: (title = '你确定要进行此操作吗？', content = '温馨提示', onOk = () => {}, onCancel = () => {}, param = {}, type) => {
    Modal[type]({
      content,
      title,
      ...param,
      onOk,
      onCancel,
    });
  },
  /**
   * 通知提醒
   * @param title 通知标题
   * @param desc 通知内容
   * @param param 其他配置
   * @param onClose 关闭前回调
   * @param type 类型
   */
  notice: (title = '这是一条通知', desc = '通知', param = {}, onClose = () => {}, type) => {
    Notice[type]({
      title,
      desc,
      ...param,
      onClose,
    });
  },
};

export default {
  message: {
    /**
     * 消息提示
     * @param content
     * @param param
     * @param onClose
     */
    info(content, param = {}, onClose) {
      method.message(content, param, onClose, 'info');
    },
    /**
     * 错误消息提示
     * @param content
     * @param param
     * @param onClose
     */
    error(content, param = {}, onClose) {
      method.message(content, param, onClose, 'error');
    },
    /**
     * 警告消息提示
     * @param content
     * @param param
     * @param onClose
     */
    warning(content, param = {}, onClose) {
      method.message(content, param, onClose, 'warning');
    },
    /**
     * 成功消息提示
     * @param content
     * @param param
     * @param onClose
     */
    success(content, param = {}, onClose) {
      method.message(content, param, onClose, 'success');
    },
    /**
     * 移除消息提示
     */
    remove() {
      close.removeMessage();
    },
  },
  notice: {
    /**
     * 消息通知
     * @param title
     * @param desc
     * @param param
     * @param onClose
     */
    info(title, desc, param = {}, onClose) {
      method.notice(title, desc, param, onClose, 'info');
    },
    /**
     * 错误消息通知
     * @param title
     * @param desc
     * @param param
     * @param onClose
     */
    error(title, desc, param = {}, onClose) {
      method.notice(title, desc, param, onClose, 'error');
    },
    /**
     * 警告消息通知
     * @param title
     * @param desc
     * @param param
     * @param onClose
     */
    warning(title, desc, param = {}, onClose) {
      method.notice(title, desc, param, onClose, 'warning');
    },
    /**
     * 成功消息通知
     * @param title
     * @param desc
     * @param param
     * @param onClose
     */
    success(title, desc, param = {}, onClose) {
      method.notice(title, desc, param, onClose, 'success');
    },
    /**
     * 关闭消息通知
     * @param name
     */
    closeNotice(name = '') {
      close.closeNotice(name);
    },
  },
  modal: {
    /**
     * 对话框
     * @param title
     * @param content
     * @param onOk
     * @param onCancel
     * @param param
     */
    info(title, content, onOk, onCancel, param = {}) {
      method.modal(title, content, onOk, onCancel, param, 'info');
    },
    /**
     * 危险对话框
     * @param title
     * @param content
     * @param onOk
     * @param onCancel
     * @param param
     */
    error(title, content, onOk, onCancel, param = {}) {
      method.modal(title, content, onOk, onCancel, param, 'error');
    },
    /**
     * 警告对话框
     * @param title
     * @param content
     * @param onOk
     * @param onCancel
     * @param param
     */
    warning(title, content, onOk, onCancel, param = {}) {
      method.modal(title, content, onOk, onCancel, param, 'warning');
    },
    /**
     * 成功对话框
     * @param title
     * @param content
     * @param onOk
     * @param onCancel
     * @param param
     */
    success(title, content, onOk, onCancel, param = {}) {
      method.modal(title, content, onOk, onCancel, param, 'success');
    },
    /**
     * 对话框
     * @param title
     * @param content
     * @param onOk
     * @param onCancel
     * @param param
     */
    confirm(title, content, onOk, onCancel, param = {}) {
      method.modal(title, content, onOk, onCancel, param, 'confirm');
    },
    /**
     * 移除对话框
     */
    remove() {
      close.removeModal();
    },
  },
};
